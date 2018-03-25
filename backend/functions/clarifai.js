const Clarifai = require('clarifai');
const envVars = require('./env_vars');
let fetch = require('node-fetch');
const unirest = require('unirest');
const youtube = require('./youtube.js');
const firebase = require('firebase');
const firebase_js = require('./firebase.js');
const env_var = require('./env_vars.js');

require('firebase/auth');
require('firebase/database');

var clarifai = function (filepath) {
  const app = new Clarifai.App({
   apiKey: envVars.clarifai_api_key
  });
  if (!firebase.apps.length) {
    firebase.initializeApp({
      apiKey: envVars.firebase_api_key,
      authDomain: 'ezcook-7572d.firebaseapp.com',
      databaseURL: 'https://ezcook-7572d.firebaseio.com/',
      storageBucket: 'https://ezcook-7572d.firebaseio.com/',
      messagingSenderId: '11729916840'
    });
  }
  var database = firebase.database();
  return app.models.predict("bd367be194cf45149e75f01d59f77ba7", filepath).then(
  function(response) {
    var items = ""
    for (var i = 0; i < response['outputs'][0]['data']['concepts'].length; i++) {
      items += response['outputs'][0]['data']['concepts'][i]['name'] + "%2C"
    }
    items = items.slice(0, -3)
    unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/findByIngredients?ingredients=" + items)
      .header("X-Mashape-Key", "IwLJqO6bAtmshh9PXpr3EhpVvpJWp1smLbBjsnwCNvi8KTvV4u")
      .header("Accept", "application/json")
      .end(function (result) {
        var title_video_id = new Map();
        for(var i = 0; i < result.body.length; i++) {
          var title = result.body[i]['title'];
          var image = result.body[i]['image'];
          return youtube(title, image, function(video_id, new_title, new_image) {
            if (video_id != undefined) {
              title_video_id[new_title] = video_id;
              database.ref('recipes/' + new_title).set({
                title: new_title,
                youtube_id: video_id,
                image: new_image
              });
            }
          });
        }
      });
  },
  function(err) {
    console.log(err);
  }
);

}

module.exports = clarifai

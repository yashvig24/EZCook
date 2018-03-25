var fs = require('fs');
var readline = require('readline');
var {google} = require('googleapis');
var OAuth2 = google.auth.OAuth2;
var CoffeeScript = require('coffee-script/register');
var gapi = require('gapi');
var search = require('youtube-search');

var youtube = function(query, image, callback) {
  var opts = {
    maxResults: 1,
    key: 'AIzaSyCFsG9xYTLVHlK9rR6dHJN0EzWVZkABUdQ'
  };

  search(query, opts, function(err, results) {
    if(err) return console.log(err);
    callback(results[0]['id'], query, image)
  })
}

module.exports = youtube

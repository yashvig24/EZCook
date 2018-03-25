from clarifai.rest import ClarifaiApp
from clarifai.rest import Image as ClImage
import json
import youtube
import unirest
import env_vars


def handler():
    app = ClarifaiApp(api_key=env_vars.clarifai_api_key)

    model = app.models.get('food-items-v1.0')
    img = ClImage(file_obj=open('pics/fridge2.jpeg', 'rb'))
    pred = model.predict([img])
    items = ""
    for con in pred['outputs'][0]['data']['concepts']:
        items += json.dumps(con['name'])[1:-1] + ", "
    items = items[:-2]

    params = {"ingredients": items}
    response = unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/findByIngredients",
                           params=params,
                           headers={
                               "X-Mashape-Key": "IwLJqO6bAtmshh9PXpr3EhpVvpJWp1smLbBjsnwCNvi8KTvV4u",
                               "X-Mashape-Host": "spoonacular-recipe-food-nutrition-v1.p.mashape.com"
                           }
                           )

    title_video_id = {}
    for res in response.body:
        title = json.dumps(res['title'])[1:-1]
        video_id = youtube.youtube_search(title)
        if video_id:
            title_video_id[title] = str(video_id)

    return title_video_id

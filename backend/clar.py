from clarifai.rest import ClarifaiApp
from clarifai.rest import Image as ClImage
import json
import requests 
import unirest

app = ClarifaiApp(api_key  = 'b0fd18e87dc8488b91f1f806e4ba56fd')

model = app.models.get('food-items-v1.0')
img = ClImage(file_obj=open('pics/fridge2.jpeg', 'rb'))
pred = model.predict([img])
items = ""
for con in pred['outputs'][0]['data']['concepts']:
    items += json.dumps(con['name'])[1:-1] + ", "
items = items[:-2]

num_rec = 10
params = {"ingredients" : items}
response = unirest.get("https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/findByIngredients", params = params,
  headers={
    "X-Mashape-Key": "IwLJqO6bAtmshh9PXpr3EhpVvpJWp1smLbBjsnwCNvi8KTvV4u",
    "X-Mashape-Host": "spoonacular-recipe-food-nutrition-v1.p.mashape.com"
  }
)
print(json.dumps(response.body))


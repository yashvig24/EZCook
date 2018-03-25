const functions = require('firebase-functions')
const gcs = require('@google-cloud/storage')({
    projectId: 'ezcook-7572d',
    keyFilename: './ezcook-7572d-firebase-adminsdk-c348t-d5f9ae8b45.json'
});
const clarifai = require('./clarifai.js')
const recipes = require('./recipes.js')

// clarifai('https://firebasestorage.googleapis.com/v0/b/ezcook-7572d.appspot.com/o/259854968.jpeg?alt=media&token=dce2611e-c6dc-4d9d-80a5-35104becdaf9');

exports.getVideoIds = functions.storage.object()
	.onChange(event => {
		const object = event.data
		const filepath = object.name
		const filename = filepath.split('/').pop()
		const fileBucket = object.bucket
		const bucket = gcs.bucket(fileBucket)
		const file = bucket.file(filename);
		return file.getSignedUrl({
		  action: 'read',
		  expires: '03-09-2491'
		}).then(signedUrls => {
			return clarifai(signedUrls[0]);
		});
})

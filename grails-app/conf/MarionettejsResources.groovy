modules = {	

	marionettejs {
		dependsOn 'underscore', 'backbone'
		resource url: [plugin: 'marionettejs', dir: 'js', file: 'backbone.babysitter.js']
		resource url: [plugin: 'marionettejs', dir: 'js', file: 'backbone.wreqr.js']
		resource url: [plugin: 'marionettejs', dir: 'js', file: 'backbone.marionette.js']
	}
}
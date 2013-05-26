class MarionettejsGrailsPluginGrailsPlugin {
    // the plugin version
    def version = "1.0.3"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Marionettejs Grails Plugin Plugin" // Headline display name of the plugin
    def author = "Roberto Guerra"
    def authorEmail = "roberto@spantree.net"
    def description = '''\
Grails Plugin for the Marionettejs libraries. Marionettejs is a Composite Framework
built on top of Backbonejs. For more information on marionettejs go to http://marionettejs.com
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/marionettejs-grails-plugin"
  
    def license = "APACHE"
    def organization = [name: 'Spantree LLC', url: 'http://spantree.net']
    def scm = [ url: "https://github.com/Spantree/marionettejs-grails-plugin" ]
}

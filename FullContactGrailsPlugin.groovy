import org.codehaus.groovy.grails.commons.ConfigurationHolder

class FullContactGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Salil Kalia"
    def authorEmail = "salil.kalia@gmail.com"
    def title = "Plugin is to get a kick start with FullContact API (api.fullcontact.com)"
    def description = '''\\
It sets up your application to start working with FullContact API. You just need to
mention the following statement in your controller or Service (in Grails context).
def fullContact
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/full-contact"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
        fullContact(com.fullcontact.api.libs.java.FullContact, ConfigurationHolder.config.com.fullcontact.api.key)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}

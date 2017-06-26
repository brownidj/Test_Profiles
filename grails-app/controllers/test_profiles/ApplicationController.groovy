package test_profiles

import grails.core.GrailsApplication
import grails.plugins.GrailsPluginManager

class ApplicationController {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}

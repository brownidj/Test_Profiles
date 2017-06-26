package test_profiles

import grails.rest.Resource

//@Resource(readOnly = false, formats = ['json', 'xml'])
class Todo {

    String description
    Boolean done = false

    static constraints = {
        description()
        done nullable: true
    }
}

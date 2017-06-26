package test_profiles

import grails.rest.RestfulController

class TodoController extends RestfulController<Todo> {

    static responseFormats = ['json', 'xml']

    TodoController() {
        super(Todo)
    }

    def pending() {
        respond Todo.findAllByDone(false), view: 'index'
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Todo.list(params), model:[TodoCount: Todo.count()]
    }


}

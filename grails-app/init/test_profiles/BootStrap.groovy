package test_profiles

class BootStrap {

    def init = { servletContext ->
        5.times {new Todo(description: "Todo ${it + 1}").save()}
        def todo_06 = new Todo(description: "Todo #6", done: true).save()
    }
    def destroy = {
    }
}

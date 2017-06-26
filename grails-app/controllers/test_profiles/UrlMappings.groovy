package test_profiles

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/todos"(resources:'todo')
        "/pendingTodos"(controller:'todo', action: 'pending')
        "/"(controller: 'application', action: 'index')
        "/ui"(view:"/ui")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

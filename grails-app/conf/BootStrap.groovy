import name.stokito.User

class BootStrap {

    def init = { servletContext ->
        new User(username: 'user', password: 'password', enabled: true).save(flash: true, failOnError: true)
    }
    def destroy = {
    }
}

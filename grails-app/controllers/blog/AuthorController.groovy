package blog

import grails.converters.JSON

class AuthorController {

    def getAuthorById() { 
        
        def a = Author.findById(params.id)
        
        
        println a
        
        //problema: si no pongo el view me lo escribe estilo JSON y chao
        //si pongo el view no para de cargar la página
        render a as JSON    
        
    }
    
    def save() {
        Author a = new Author(params)
        
        a.registerDate = new Date()

        if (!a.save()) { 
            a.errors.each { println it } 
        }
        redirect(uri: "/author/getAuthorById?id=1")
    }
}

package blog

class AuthorService {

    def getAllAuthors() {
        Author.findAll()
    }
    
}

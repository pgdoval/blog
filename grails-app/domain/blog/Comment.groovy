package blog

class Comment {

    Long id
    static belongsTo = [entry : Entry, user:User]
//    Entry entry
//    User user
    Date date
    
    static constraints = {
    }
}

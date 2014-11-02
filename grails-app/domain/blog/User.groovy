package blog
import groovy.transform.ToString

@ToString
class User {

    Long id
    
    static hasMany = {
        comments:Comment
    }
    
    String name, userName, password, twitter
    Date registerDate
    
    static constraints = {
        twitter nullable:true
    
        
        
    }
    
    static mapping = {
        table "usr"
    }
    
}
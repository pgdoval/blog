package blog

class UserService {

    def saveUser(User u) {
        u.save()
    }
    
    def deleteUser(User u) {
        u.delete()
    }
    
    def getUser(User u) {
        User.findById(u.id)
    }
    

    
    
    
}

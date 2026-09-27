#!/user/bin/env groovy
import com.example.docker

def call( String imageName){
    return new Docker(this).buildDockerImage(imageName)

}
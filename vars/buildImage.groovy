#!/user/bin/env groovy
import com.examlple.docker

def call( String imageName){
    return new Docker(this).buildDockerImage(imageName)

}
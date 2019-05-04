job('My Job 1') {
    scm {
        git('https://github.com/seb2b/tp-jenkins-demo1') {  node -> 
            node / gitConfigName('salliot  ')
            node / gitConfigEmail('seballiot@orange.fr')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS9')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}

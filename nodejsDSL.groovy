job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/roberto14118927/nodeJenkins.git', 'main') { node ->
            node / gitConfigName('roberto14118927')
            node / gitConfigEmail('robertoruiz141189@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    publishers {

    }
}
job('first_maven_project_via_dsl'){
    scm{
        git('https://github.com/prabhjot219/Jenkins_Upgradev3.git','main')        
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}
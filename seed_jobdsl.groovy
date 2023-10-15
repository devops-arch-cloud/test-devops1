pipelineJob('aurora-postgres-cluster-existing-vpc') {
   definition {
                cpsScm {
                    scm {
                        git {
                            remote {
                                github("https://github.com/devops-arch-cloud/test-devops1")
                               
                            }
    
                            branch('$revision')
                        }
                    }
    
}
   }
}

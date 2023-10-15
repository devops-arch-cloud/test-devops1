pipelineJob('aurora-postgres-cluster-existing-vpc') {
   definition {
                cpsScm {
                    scm {
                        git {
                            remote {
                                github("devops-arch-cloud/test-devops1")
                               
                            }
    
                            branch('main')
                        }
                    }
    
}
   }
}

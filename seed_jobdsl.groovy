pipelineJob('aurora-postgres-cluster-existing-vpc') {
   definition {
               
    cps {
      script(readFileFromWorkspace('logic/productPipeline.jenkinsfile'))
      script(readFileFromWorkspace('pipeline1'))
      sandbox()     
    }
 
   }
}

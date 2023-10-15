pipelineJob('product-job') {
  definition {
    cps {
      script(readFileFromWorkspace('logic/productPipeline.jenkinsfile'))
      sandbox()     
    }
  }
}

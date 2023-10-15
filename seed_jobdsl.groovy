pipelineJob('product-job') {
  definition {
    cps {
      script(readFileFromWorkspace('pipeline1'))
      sandbox()     
    }
  }
}

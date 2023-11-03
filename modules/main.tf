variable "awsprops" {
    type = map
    default = {
    itype = "t2.large"
    publicip = true
    keyname = "myseckey"
    secgroupname = "IAC-Sec-Group"
  }
}

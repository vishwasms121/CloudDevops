variable "access_key" {
        description = "Access key to AWS console"
}
variable "secret_key" {
        description = "Secret key to AWS console"
}
variable "token" {
        description = "Token key to AWS console"
}
variable "instance_name" {
        description = "Name of the instance to be created"
        default = "awsbuilder-demo"
}
variable "instance_type" {
        default = "t2.micro"   
}

variable "subnet_id" {
        description = "The VPC subnet the instance(s) will be created in"
        default = "subnet-065588da7b835f2b9"
}

variable "ami_id" {
        description = "The AMI to use"
        default = "ami-01cae1550c0adea9c"
}

variable "number_of_instances" {
        description = "number of instances to be created"
        default = 1
}

variable "ami_key_pair_name" {
        default = "x21205825-Vishwas-NCI"
}

variable "vpc_id" {
		default = "vpc-0c735787e36a3c094"
}
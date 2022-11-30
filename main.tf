terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.0" 
    }
  } 
}

provider "aws" {
    access_key     = "${var.access_key}"
    secret_key     = "${var.secret_key}"
    token	   = "${var.token}" 
    region 	   = "eu-west-1" 
} 
 
data "aws_security_group" "selected" {
  id = "${var.security_group_id}"
} 

resource "aws_instance" "ec2_instance" {
    ami = "${var.ami_id}"
    count = "${var.number_of_instances}"
    subnet_id = "${var.subnet_id}"
    instance_type = "${var.instance_type}"
    key_name = "${var.ami_key_pair_name}"
    security_groups = [data.aws_security_group.selected.id]
} 
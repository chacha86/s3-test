package com.think.terraa

import org.springframework.stereotype.Service
import software.amazon.awssdk.services.s3.S3Client

@Service
class S3ServiceImpl : S3Service {
    override fun getBucketNames(): List<String> {
        return listOf("")
    }
}
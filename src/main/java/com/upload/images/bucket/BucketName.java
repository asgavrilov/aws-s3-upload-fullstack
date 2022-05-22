package com.upload.images.bucket;

public enum BucketName {

    PROFILE_IMAGE("gavrilov-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}

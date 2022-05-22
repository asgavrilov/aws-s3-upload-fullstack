package com.upload.images.datastore;

import com.upload.images.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("53a69b74-9d86-4beb-855a-d5aa3900e415"), "alexgavrilov", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("ed049f0c-5222-4fc2-a01f-9f8175192810"), "alexavictory", null));
    }


    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}

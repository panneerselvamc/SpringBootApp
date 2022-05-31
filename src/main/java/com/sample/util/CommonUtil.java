package com.sample.util;

import com.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.sample.util.Constant.MAX_RETRIES;

@Component
public class CommonUtil {

    @Autowired
    RestUtil restUtil;

    public User getUserDetails(final String API) {
        int retry = 0;
        User data = null;
        while (retry < MAX_RETRIES){
            try {
                // CHECK API NAME AND CALL THE RELEVANT METHOD
                data = restUtil.getUserDetails();
                System.out.println(data);
                break;
            }
            catch (Exception e){
                retry++;
                System.out.println("3RD PARTY API CALL FAILED FOR ATTEMPT: "+retry);
                if (retry > MAX_RETRIES){
                    System.out.println(" MAXIMUM ATTEMPT REACHED ");
                }
            }

        }

        return data;
    }
}

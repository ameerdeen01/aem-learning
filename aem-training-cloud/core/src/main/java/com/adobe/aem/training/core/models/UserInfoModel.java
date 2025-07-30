package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        adapters = UserInfoModel.class,
        resourceType = "aem-training/components/userinfo",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class UserInfoModel {

    @ValueMapValue
    private String name;

    @ValueMapValue
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

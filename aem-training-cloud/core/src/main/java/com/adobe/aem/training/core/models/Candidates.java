package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Candidates {

    @ValueMapValue
    private String name;

    @ValueMapValue
    private String image;

    @ChildResource
    private List<Technologies> technologies;

    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }

    public List<Technologies> getTechnologies() {
        return technologies;
    }


}

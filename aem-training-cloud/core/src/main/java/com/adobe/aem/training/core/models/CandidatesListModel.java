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
public class CandidatesListModel {

    @ValueMapValue
    private String heading;

    @ChildResource
    List<Candidates> candidates;

    public String getHeading() {
        return heading;
    }

    public List<Candidates> getCandidates() {
        return candidates;
    }

}

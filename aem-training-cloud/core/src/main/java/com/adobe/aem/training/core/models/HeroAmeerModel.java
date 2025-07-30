package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        adapters = HeroAmeerModel.class,
        resourceType = "aem-training/components/heroameer",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class HeroAmeerModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String ctaLabel;

    @ValueMapValue
    @Default (values="#")
    private String ctaLink;

    @ValueMapValue
    private String backgroundImage;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getCtaLabel() {
        return ctaLabel;
    }

    public String getCtaLink() {
        return ctaLink;
    }
    public String getBackgroundImage() {
        return backgroundImage;
    }
}

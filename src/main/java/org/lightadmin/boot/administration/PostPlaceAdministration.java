package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.boot.domain.PostPlace;

public class PostPlaceAdministration extends AdministrationConfiguration<PostPlace> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

    @Override
    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {

        return fragmentBuilder
                .field("postId").caption("Post")
                .field("placeId").caption("Place")
                .field("createdAt").caption("Created At")
                .field("updatedAt").caption("Updated At")
                .build();
    }
}
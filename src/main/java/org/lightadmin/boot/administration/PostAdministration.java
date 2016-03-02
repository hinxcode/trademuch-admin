package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.boot.domain.Post;

public class PostAdministration extends AdministrationConfiguration<Post> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

//    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
//
//        return fragmentBuilder
//                .field("uuid").caption("UUID")
//                .field("title").caption("Title")
//                .field("startDate").caption("Start Date")
//                .field("endDate").caption("End Date")
//                .field("coverImage").caption("Cover Image")
//                .field("createdAt").caption("Created At")
//                .field("updatedAt").caption("Updated At")
//                .field("userId").caption("User")
//                .build();
//    }
}
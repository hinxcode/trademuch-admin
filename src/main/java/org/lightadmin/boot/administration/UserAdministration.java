package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EnumElement;
import org.lightadmin.boot.domain.User;

public class UserAdministration extends AdministrationConfiguration<User> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

//    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
//
//        return fragmentBuilder
//                .field("uuid").caption("UUID")
//                .field("username").caption("User Name")
//                .field("fullName").caption("Full Name")
//                .field("firstName").caption("First Name")
//                .field("lastName").caption("Last Name")
//                .field("email").caption("Email")
//                .field("telephone").caption("Telephone")
//                .field("age").caption("Age")
//                .field("gender").caption("Gender")
//                .enumeration(
//                        EnumElement.element(0, "none"),
//                        EnumElement.element(1, "male"),
//                        EnumElement.element(2, "female")
//                )
//                .field("isFirstLogin").caption("First Login")
//                .enumeration(
//                        EnumElement.element(0, "No"),
//                        EnumElement.element(1, "Yes")
//                )
//                .field("createdAt").caption("Created At")
//                .field("updatedAt").caption("Update At")
//                .build();
//    }

}
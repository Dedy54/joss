package org.javaswift.joss.client.impl;

import org.apache.http.client.HttpClient;
import org.javaswift.joss.client.core.AbstractAccount;
import org.javaswift.joss.command.impl.factory.AccountCommandFactoryImpl;
import org.javaswift.joss.command.shared.identity.AuthenticationCommand;
import org.javaswift.joss.command.shared.identity.access.AccessImpl;

public class AccountImpl extends AbstractAccount {

    public AccountImpl(AuthenticationCommand command, HttpClient httpClient, AccessImpl access, boolean allowCaching) {
        super(
                new AccountCommandFactoryImpl(httpClient, access, command),
                new ContainerFactoryImpl(),
                new WebsiteFactoryImpl(),
                allowCaching
        );
    }

}

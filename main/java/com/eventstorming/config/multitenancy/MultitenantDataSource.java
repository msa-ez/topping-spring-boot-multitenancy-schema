path: {{name}}/{{{options.packagePath}}}/config/multitenancy
---
package {{options.package}}.config.multitenancy;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultitenantDataSource extends AbstractRoutingDataSource {

    @Override
    protected String determineCurrentLookupKey() {
        return TenantContext.getCurrentTenant();
    }

}
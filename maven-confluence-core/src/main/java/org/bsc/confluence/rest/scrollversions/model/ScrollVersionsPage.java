package org.bsc.confluence.rest.scrollversions.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ScrollVersionsPage {

    private ScrollVersionsTargetVersion targetVersion;
    private String scrollPageTitle;
    private String plainConfluenceTitle;
    private String confluencePageTitle;
    private String scrollPageId;
    private String pageType;
    private String changeType;
    private Long confluencePageId;
    private String spaceKey;
    private boolean available;
    private boolean converted;
    private Boolean isDirty;
    private String includedScrollPageIds;
    private boolean cached;
    private Long lastModificationDate;
    private String lastModifier;

}

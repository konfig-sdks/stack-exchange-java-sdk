package com.konfigthis.client;

import com.konfigthis.client.api.AccessTokenApi;
import com.konfigthis.client.api.AnswerApi;
import com.konfigthis.client.api.AssociatedApi;
import com.konfigthis.client.api.BadgeApi;
import com.konfigthis.client.api.CommentApi;
import com.konfigthis.client.api.EditApi;
import com.konfigthis.client.api.ErrorApi;
import com.konfigthis.client.api.EventApi;
import com.konfigthis.client.api.FavoriteApi;
import com.konfigthis.client.api.FilterApi;
import com.konfigthis.client.api.InformationApi;
import com.konfigthis.client.api.MentionApi;
import com.konfigthis.client.api.MergeApi;
import com.konfigthis.client.api.MessageApi;
import com.konfigthis.client.api.NotificationApi;
import com.konfigthis.client.api.PermissionApi;
import com.konfigthis.client.api.PostApi;
import com.konfigthis.client.api.PrivilegeApi;
import com.konfigthis.client.api.QueryApi;
import com.konfigthis.client.api.QuestionApi;
import com.konfigthis.client.api.ReputationApi;
import com.konfigthis.client.api.RevisionApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.SiteApi;
import com.konfigthis.client.api.TagApi;
import com.konfigthis.client.api.TimelineApi;
import com.konfigthis.client.api.UserApi;

public class StackExchange {
    private ApiClient apiClient;
    public final AccessTokenApi accessToken;
    public final AnswerApi answer;
    public final AssociatedApi associated;
    public final BadgeApi badge;
    public final CommentApi comment;
    public final EditApi edit;
    public final ErrorApi error;
    public final EventApi event;
    public final FavoriteApi favorite;
    public final FilterApi filter;
    public final InformationApi information;
    public final MentionApi mention;
    public final MergeApi merge;
    public final MessageApi message;
    public final NotificationApi notification;
    public final PermissionApi permission;
    public final PostApi post;
    public final PrivilegeApi privilege;
    public final QueryApi query;
    public final QuestionApi question;
    public final ReputationApi reputation;
    public final RevisionApi revision;
    public final SearchApi search;
    public final SiteApi site;
    public final TagApi tag;
    public final TimelineApi timeline;
    public final UserApi user;

    public StackExchange() {
        this(null);
    }

    public StackExchange(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accessToken = new AccessTokenApi(this.apiClient);
        this.answer = new AnswerApi(this.apiClient);
        this.associated = new AssociatedApi(this.apiClient);
        this.badge = new BadgeApi(this.apiClient);
        this.comment = new CommentApi(this.apiClient);
        this.edit = new EditApi(this.apiClient);
        this.error = new ErrorApi(this.apiClient);
        this.event = new EventApi(this.apiClient);
        this.favorite = new FavoriteApi(this.apiClient);
        this.filter = new FilterApi(this.apiClient);
        this.information = new InformationApi(this.apiClient);
        this.mention = new MentionApi(this.apiClient);
        this.merge = new MergeApi(this.apiClient);
        this.message = new MessageApi(this.apiClient);
        this.notification = new NotificationApi(this.apiClient);
        this.permission = new PermissionApi(this.apiClient);
        this.post = new PostApi(this.apiClient);
        this.privilege = new PrivilegeApi(this.apiClient);
        this.query = new QueryApi(this.apiClient);
        this.question = new QuestionApi(this.apiClient);
        this.reputation = new ReputationApi(this.apiClient);
        this.revision = new RevisionApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.site = new SiteApi(this.apiClient);
        this.tag = new TagApi(this.apiClient);
        this.timeline = new TimelineApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
    }

}

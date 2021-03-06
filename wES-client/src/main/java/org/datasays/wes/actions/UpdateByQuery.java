package org.datasays.wes.actions;

import okhttp3.HttpUrl;
import org.datasays.wes.core.RequestInfo;
import org.datasays.wes.types.*;
// documentation: https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html
public class UpdateByQuery extends RequestInfo{

	public UpdateByQuery(String baseUrl){
		super(baseUrl);
	}
	public UpdateByQuery(HttpUrl baseUrl){
		super(baseUrl);
	}

	// param: string analyzer: The analyzer to use for the query string
	public UpdateByQuery analyzer(String analyzer){
		addParams("analyzer", analyzer);
		return this;
	}
	// param: boolean analyzeWildcard: Specify whether wildcard and prefix queries should be analyzed (default: false)
	public UpdateByQuery analyzeWildcard(boolean analyzeWildcard){
		addParams("analyzeWildcard", analyzeWildcard);
		return this;
	}
	// param: enum defaultOperator: The default operator for query string query (AND or OR)
	public UpdateByQuery defaultOperator(EnumDefaultOperator defaultOperator){
		addParams("defaultOperator", defaultOperator);
		return this;
	}
	// param: string df: The field to use as default where no field prefix is given in the query string
	public UpdateByQuery df(String df){
		addParams("df", df);
		return this;
	}
	// param: number from: Starting offset (default: 0)
	public UpdateByQuery from(Number from){
		addParams("from", from);
		return this;
	}
	// param: boolean ignoreUnavailable: Whether specified concrete indices should be ignored when unavailable (missing or closed)
	public UpdateByQuery ignoreUnavailable(boolean ignoreUnavailable){
		addParams("ignoreUnavailable", ignoreUnavailable);
		return this;
	}
	// param: boolean allowNoIndices: Whether to ignore if a wildcard indices expression resolves into no concrete indices. (This includes `_all` string or when no indices have been specified)
	public UpdateByQuery allowNoIndices(boolean allowNoIndices){
		addParams("allowNoIndices", allowNoIndices);
		return this;
	}
	// param: enum conflicts: What to do when the update by query hits version conflicts?
	public UpdateByQuery conflicts(EnumConflicts conflicts){
		addParams("conflicts", conflicts);
		return this;
	}
	// param: enum expandWildcards: Whether to expand wildcard expression to concrete indices that are open, closed or both.
	public UpdateByQuery expandWildcards(EnumExpandWildcards expandWildcards){
		addParams("expandWildcards", expandWildcards);
		return this;
	}
	// param: boolean lenient: Specify whether format-based query failures (such as providing text to a numeric field) should be ignored
	public UpdateByQuery lenient(boolean lenient){
		addParams("lenient", lenient);
		return this;
	}
	// param: string pipeline: Ingest pipeline to set on index requests made by this action. (default: none)
	public UpdateByQuery pipeline(String pipeline){
		addParams("pipeline", pipeline);
		return this;
	}
	// param: string preference: Specify the node or shard the operation should be performed on (default: random)
	public UpdateByQuery preference(String preference){
		addParams("preference", preference);
		return this;
	}
	// param: string q: Query in the Lucene query string syntax
	public UpdateByQuery q(String q){
		addParams("q", q);
		return this;
	}
	// param: list routing: A comma-separated list of specific routing values
	public UpdateByQuery routing(String routing){
		addParams("routing", routing);
		return this;
	}
	// param: time scroll: Specify how long a consistent view of the index should be maintained for scrolled search
	public UpdateByQuery scroll(long scroll){
		addParams("scroll", scroll);
		return this;
	}
	// param: enum searchType: Search operation type
	public UpdateByQuery searchType(EnumSearchType searchType){
		addParams("searchType", searchType);
		return this;
	}
	// param: time searchTimeout: Explicit timeout for each search request. Defaults to no timeout.
	public UpdateByQuery searchTimeout(long searchTimeout){
		addParams("searchTimeout", searchTimeout);
		return this;
	}
	// param: number size: Number of hits to return (default: 10)
	public UpdateByQuery size(Number size){
		addParams("size", size);
		return this;
	}
	// param: list sort: A comma-separated list of <field>:<direction> pairs
	public UpdateByQuery sort(String sort){
		addParams("sort", sort);
		return this;
	}
	// param: list source: True or false to return the _source field or not, or a list of fields to return
	public UpdateByQuery source(String source){
		addParams("source", source);
		return this;
	}
	// param: list sourceExclude: A list of fields to exclude from the returned _source field
	public UpdateByQuery sourceExclude(String sourceExclude){
		addParams("sourceExclude", sourceExclude);
		return this;
	}
	// param: list sourceInclude: A list of fields to extract and return from the _source field
	public UpdateByQuery sourceInclude(String sourceInclude){
		addParams("sourceInclude", sourceInclude);
		return this;
	}
	// param: number terminateAfter: The maximum number of documents to collect for each shard, upon reaching which the query execution will terminate early.
	public UpdateByQuery terminateAfter(Number terminateAfter){
		addParams("terminateAfter", terminateAfter);
		return this;
	}
	// param: list stats: Specific 'tag' of the request for logging and statistical purposes
	public UpdateByQuery stats(String stats){
		addParams("stats", stats);
		return this;
	}
	// param: boolean version: Specify whether to return document version as part of a hit
	public UpdateByQuery version(boolean version){
		addParams("version", version);
		return this;
	}
	// param: boolean versionType: Should the document increment the version number (internal) on hit or not (reindex)
	public UpdateByQuery versionType(boolean versionType){
		addParams("versionType", versionType);
		return this;
	}
	// param: boolean requestCache: Specify if request cache should be used for this request or not, defaults to index level setting
	public UpdateByQuery requestCache(boolean requestCache){
		addParams("requestCache", requestCache);
		return this;
	}
	// param: boolean refresh: Should the effected indexes be refreshed?
	public UpdateByQuery refresh(boolean refresh){
		addParams("refresh", refresh);
		return this;
	}
	// param: time timeout: Time each individual bulk request should wait for shards that are unavailable.
	public UpdateByQuery timeout(long timeout){
		addParams("timeout", timeout);
		return this;
	}
	// param: string waitForActiveShards: Sets the number of shard copies that must be active before proceeding with the update by query operation. Defaults to 1, meaning the primary shard only. Set to `all` for all shard copies, otherwise set to any non-negative value less than or equal to the total number of copies for the shard (number of replicas + 1)
	public UpdateByQuery waitForActiveShards(String waitForActiveShards){
		addParams("waitForActiveShards", waitForActiveShards);
		return this;
	}
	// param: number scrollSize: Size on the scroll request powering the update_by_query
	public UpdateByQuery scrollSize(Number scrollSize){
		addParams("scrollSize", scrollSize);
		return this;
	}
	// param: boolean waitForCompletion: Should the request should block until the update by query operation is complete.
	public UpdateByQuery waitForCompletion(boolean waitForCompletion){
		addParams("waitForCompletion", waitForCompletion);
		return this;
	}
	// param: number requestsPerSecond: The throttle to set on this request in sub-requests per second. -1 means no throttle.
	public UpdateByQuery requestsPerSecond(Number requestsPerSecond){
		addParams("requestsPerSecond", requestsPerSecond);
		return this;
	}
	// param: integer slices: The number of slices this task should be divided into. Defaults to 1 meaning the task isn't sliced into subtasks.
	public UpdateByQuery slices(Integer slices){
		addParams("slices", slices);
		return this;
	}
	// body:The search definition using the Query DSL
	@Override
	public void setBody(Object body) {
		super.setBody(body);
	}

	//A comma-separated list of index names to search; use `_all` or empty string to perform the operation on all indices
	private String index;
	//A comma-separated list of document types to search; leave empty to perform the operation on all types
	private String type;
	public UpdateByQuery setParts(String index,String type){
		this.index=index;
		this.type=type;

		return this;
	}

	@Override
	public String parseUrl(String method) {
		if(!"POST".equalsIgnoreCase(method)){
			throw new IllegalArgumentException("Unsupported method:"+method);
		}
		//=>/{index}/{type}/_update_by_query
		if(index != null && type != null ){
			setUrl(index, type, "_update_by_query");
			return super.parseUrl(method);
		}
		//=>/{index}/_update_by_query
		if(index != null ){
			setUrl(index, "_update_by_query");
			return super.parseUrl(method);
		}

		return null;
	}
}

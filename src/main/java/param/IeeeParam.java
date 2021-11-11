package param;

import lombok.Data;

/**
 * @author yagol
 * @TIME 2021/11/11 - 8:32 下午
 * @Description
 **/
@Data
public class IeeeParam {
    public final static String BASE_SEARCH_URL = "https://ieeexplore.ieee.org/search/searchresult.jsp?";
    public final static String UNTIL_CONDITION_XPATH = "//xpl-results-list//*[@id>0]";
    public final static String PAPER_SIZE_XPATH = "//xpl-search-results//*[@class='Dashboard-header col-12']";
}

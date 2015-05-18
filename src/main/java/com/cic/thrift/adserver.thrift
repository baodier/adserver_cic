struct ad_info {
    1: string os,
    2: string browser,
    3: string category,
    4: string searchWord
}

struct ad_ret {
    1: string keyword,
    2: double bid,
    3: i32 adid
}
service AdServerService{
list<ad_ret> ask4Ads(1:ad_info info)
}
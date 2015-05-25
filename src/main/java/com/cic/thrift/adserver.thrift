struct ad_info {
    1: string os,
    2: string browser,
    3: string category,
    4: string searchWord
}

service AdServerService{
list<String> ask4Ads(1:ad_info info)
}
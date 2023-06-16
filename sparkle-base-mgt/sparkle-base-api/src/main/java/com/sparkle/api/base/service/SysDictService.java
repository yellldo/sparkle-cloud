package com.sparkle.api.base.service;

import com.sparkle.api.base.dto.QuerySysDictDto;
import com.sparkle.domain.R;

/**
 * ClassName : SysDictService<br>
 * Description : SysDictService<br>
 *
 * @author : sj
 * @date : 2022/3/1
 */
public interface SysDictService {

    /**
     * @return
     */
    R querySysDict(QuerySysDictDto querySysDictDto);


}

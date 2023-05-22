package com.dave.view.controller;


import cn.hutool.core.map.MapUtil;
import cn.hutool.core.math.MathUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 模拟控制类
 *
 * @author 小猪佩奇
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/view")
public class ViewController {


    /**
     * 左边菜单栏
     */
    @RequestMapping("/leftList")
    public Map selectTblMaschinen() {
        List<Map> menuNodes =  IntStream.range(1, 15)
                .mapToObj(o -> MapUtil.builder(new HashMap<String, Object>())
                        .put("title", "SPM" + o)
                        .put("key", "View1")
                        .put("icon", "icon-monitor")
                        .put("count", RandomUtil.randomInt(12))
                        .build())
                .collect(Collectors.toList());


        List<String> list = new ArrayList<>();
        list.add("View1");

        String a ="{\n" +
                "    title: '刀具管理',\n" +
                "    key: 'tablelist',\n" +
                "    icon: 'icon-cog',\n" +
                "    children: [\n" +
                "      {\n" +
                "        title: '机床列表',\n" +
                "        key: 'TableBasic',\n" +
                "        icon: 'icon-server',\n" +
                "        children: [\n" +
                "          {\n" +
                "            title: 'SPM1',\n" +
                "            key: 'View1',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }, {\n" +
                "            title: 'SPM2',\n" +
                "            key: 'View2',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 5\n" +
                "          }, {\n" +
                "            title: 'SPM3',\n" +
                "            key: 'View3',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 1\n" +
                "          }, {\n" +
                "            title: 'SPM4',\n" +
                "            key: 'View4',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 2\n" +
                "          }, {\n" +
                "            title: 'SPM5',\n" +
                "            key: 'View5',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 2\n" +
                "          }, {\n" +
                "            title: 'SPM6',\n" +
                "            key: 'View6',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }, {\n" +
                "            title: 'SPM7',\n" +
                "            key: 'View7',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }, {\n" +
                "            title: 'SPM8',\n" +
                "            key: 'View8',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 2\n" +
                "          }, {\n" +
                "            title: 'SPM9',\n" +
                "            key: 'View9',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 2\n" +
                "          }, {\n" +
                "            title: 'SPM10',\n" +
                "            key: 'View10',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }, {\n" +
                "            title: 'SPM11',\n" +
                "            key: 'View11',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 5\n" +
                "          }, {\n" +
                "            title: 'SPM12',\n" +
                "            key: 'View12',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }, {\n" +
                "            title: 'SPM13',\n" +
                "            key: 'View13',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 2\n" +
                "          }, {\n" +
                "            title: 'SPM14',\n" +
                "            key: 'View14',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 1\n" +
                "          }, {\n" +
                "            title: 'SPM15',\n" +
                "            key: 'View15',\n" +
                "            icon: 'icon-monitor',\n" +
                "            count: 0\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }";

        Map result = MapUtil.builder()
                .put("menus", JSONUtil.parseObj(a))
                .put("perms", list).build();
        return result;
    }

}

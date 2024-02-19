package com.alipay.sofa.koupleless.maven.plugin.model;

import lombok.*;
import org.apache.maven.model.Dependency;

import java.util.List;

/**
 * @author CodeNoobKing
 * @date 2024/2/6
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class KouplelessAdapterConfig {

    /**
     * 存在一些通用的依赖，需要用户引入。
     */
    List<Dependency> commonDependencies;

    /**
     * 适配的依赖。
     */
    List<MavenDependencyAdapterMapping> adapterMappings;
}

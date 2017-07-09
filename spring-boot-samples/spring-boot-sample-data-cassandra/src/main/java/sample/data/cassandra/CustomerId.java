/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.cassandra;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cql.core.PrimaryKeyType;

/**
 * @author Ratish
 */

@PrimaryKeyClass
public class CustomerId {

	@PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private UUID id;

	@PrimaryKeyColumn(name = "creationMonth", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private String creatioMonth;

	public CustomerId(UUID id, String creatioMonth) {
		this.id = id;
		this.creatioMonth = creatioMonth;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return this.id;
	}

	/**
	 * @return the creatioMonth
	 */
	public String getCreatioMonth() {
		return this.creatioMonth;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, creatioMonth='%s']", this.id,
				this.creatioMonth);
	}

}

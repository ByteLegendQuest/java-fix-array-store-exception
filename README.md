<details open='true'>
<summary>English</summary>

# Fix `ArrayIndexOutOfBoundsException`

[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java)'s `incrementNumbersInCsv` method increments each number in comma separated string by 1.
For example, input `"1,2,3"`, output `"2,3,4"`; input `"-1,99"`, output `"0,100"`.
Current implementation throws `ArrayStoreException`, please fix it.

```
Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
```

- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can [click here to see detailed docs](https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Challenge.java`
</details>
<details>
<summary>简体中文</summary>

# 修复`ArrayStoreException`

[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java)中的`incrementNumbersInCsv`方法将字符串中逗号分隔的每个数字增加1。
例如，输入字符串`"1,2,3"`，返回字符串`"2,3,4"`；输入字符串`"-1,99"`，返回字符串`"0,100"`。
现在的实现会抛出`ArrayStoreException`，请修复之。

```
Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
```

- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-fix-array-store-exception`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[这里查看详细文档](https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/zh_hans/clone-and-import.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork仓库、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/35RreUUGWt)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Challenge.java`
</details>
<details>
<summary>繁體中文</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Español</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>العربية</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Português</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Bahasa Indonesia</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Français</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>日本語</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Русский</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Deutsch</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>한국어</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>
<details>
<summary>Italiano</summary>

<h1>Fix <code class="notranslate">ArrayIndexOutOfBoundsException</code></h1>
<p><a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/src/main/java/com/bytelegend/Challenge.java" target="_blank">src/main/java/com/bytelegend/Challenge.java</a>'s <code class="notranslate">incrementNumbersInCsv</code> method increments each number in comma separated string by 1.
For example, input <code class="notranslate">&quot;1,2,3&quot;</code>, output <code class="notranslate">&quot;2,3,4&quot;</code>; input <code class="notranslate">&quot;-1,99&quot;</code>, output <code class="notranslate">&quot;0,100&quot;</code>.
Current implementation throws <code class="notranslate">ArrayStoreException</code>, please fix it.</p>
<pre class="notranslate"><code class="notranslate">Exception in thread &quot;main&quot; java.lang.ArrayStoreException: java.lang.Integer
  at com.bytelegend.Challenge.incrementNumbersInCsv(Challenge.java:12)
  at com.bytelegend.Challenge.main(Challenge.java:5)
</code></pre>
<ul>
<li>You can accomplish this challenge via any way below:
<ul>
<li>Recommended for beginners: run <code class="notranslate">git clone https://github.com/ByteLegendQuest/java-fix-array-store-exception</code> to download the code,
finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
<ul>
<li>If you don't know how, you can <a href="https://github.com/ByteLegendQuest/java-fix-array-store-exception/blob/main/docs/en/clone-and-import.md" target="_blank">click here to see detailed docs</a>.</li>
</ul>
</li>
<li>Very unrecommended: you can <a href="https://codeload.github.com/ByteLegendQuest/java-fix-array-store-exception/zip/refs/heads/main" target="_blank">click here to download zipped code</a> if you don't like <code class="notranslate">git</code> operations.</li>
<li>Or: if you are confident enough to write code in web editor directly, go ahead.</li>
<li>Or: if you are familiar with GitHub, you can fork the repo, finish the challenge and create a pull request.</li>
</ul>
</li>
<li>The bot will check your PR and tell you if you accomplish the challenge.</li>
<li>Go back to <a href="https://bytelegend.com" target="_blank">ByteLegend</a> and continue your hero journey.</li>
</ul>
<p>Good luck!</p>
<p>If you need any help, feel free to join the <a href="https://discord.gg/35RreUUGWt" target="_blank">Discord Community</a> or contact us via <a href="mailto:contact@bytelegend.com" target="_blank">contact@bytelegend.com</a>.</p>
<p><strong>Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:</strong></p>
<ul>
<li><code class="notranslate">src/main/java/com/bytelegend/Challenge.java</code></li>
</ul>
</details>